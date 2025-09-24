from pyamaze import maze, agent, textLabel
import heapq

def heuristic(a, b):
    # Manhattan distance
    return abs(a[0] - b[0]) + abs(a[1] - b[1])

def a_star_search(m, start, goal):
    frontier = []
    heapq.heappush(frontier, (0, start))
    came_from = {}
    cost_so_far = {}
    came_from[start] = None
    cost_so_far[start] = 0

    while frontier:
        _, current = heapq.heappop(frontier)

        if current == goal:
            break

        for d in 'ESNW':
            if m.maze_map[current][d] == True:
                if d == 'E':
                    neighbor = (current[0], current[1] + 1)
                elif d == 'W':
                    neighbor = (current[0], current[1] - 1)
                elif d == 'N':
                    neighbor = (current[0] - 1, current[1])
                elif d == 'S':
                    neighbor = (current[0] + 1, current[1])

                new_cost = cost_so_far[current] + 1
                if neighbor not in cost_so_far or new_cost < cost_so_far[neighbor]:
                    cost_so_far[neighbor] = new_cost
                    priority = new_cost + heuristic(goal, neighbor)
                    heapq.heappush(frontier, (priority, neighbor))
                    came_from[neighbor] = current

    # Reconstruct path
    path = {}
    cell = goal
    while cell != start:
        path[came_from[cell]] = cell
        cell = came_from[cell]
    return path


if __name__ == "__main__":
    m = maze(100, 100)   # Create 10x10 maze
    m.CreateMaze()

    start = (m.rows, m.cols)  # Bottom-right
    goal = (1, 1)             # Top-left

    path = a_star_search(m, start, goal)

    a = agent(m, footprints=True, filled=True)
    m.tracePath({a: path})
    l = textLabel(m, 'A* Path Length', len(path) + 1)
    m.run()

from pyamaze import maze, agent, textLabel
import heapq

def heuristic(a, b):
    # Manhattan distance
    return abs(a[0] - b[0]) + abs(a[1] - b[1])

def greedy_best_first_search(m, start, goal):
    frontier = []
    heapq.heappush(frontier, (0, start))
    came_from = {}
    came_from[start] = None

    while frontier:
        _, current = heapq.heappop(frontier)

        if current == goal:
            break

        for d in 'ESNW':  # Possible moves: East, South, North, West
            if m.maze_map[current][d] == True:
                if d == 'E':
                    neighbor = (current[0], current[1] + 1)
                elif d == 'W':
                    neighbor = (current[0], current[1] - 1)
                elif d == 'N':
                    neighbor = (current[0] - 1, current[1])
                elif d == 'S':
                    neighbor = (current[0] + 1, current[1])

                if neighbor not in came_from:
                    priority = heuristic(goal, neighbor)
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

    start = (m.rows, m.cols)  # Bottom-right corner
    goal = (1, 1)             # Top-left corner

    path = greedy_best_first_search(m, start, goal)

    a = agent(m, footprints=True, filled=True)
    m.tracePath({a: path})
    l = textLabel(m, 'Greedy Path Length', len(path) + 1)
    m.run()

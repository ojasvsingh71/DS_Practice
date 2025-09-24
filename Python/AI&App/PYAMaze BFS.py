from pyamaze import maze, agent

def BFS(m):
    start = (m.rows, m.cols)   # start at bottom-right
    goal = (1, 1)              # goal at top-left
    
    frontier = [start]         # queue for BFS
    explored = {start: None}   # maps each cell to its parent

    while frontier:
        current = frontier.pop(0)   # FIFO queue
        if current == goal:
            break

        # Explore neighbors
        for direction in 'ESNW':
            if m.maze_map[current][direction]:
                if direction == 'E':
                    child = (current[0], current[1]+1)
                elif direction == 'W':
                    child = (current[0], current[1]-1)
                elif direction == 'N':
                    child = (current[0]-1, current[1])
                elif direction == 'S':
                    child = (current[0]+1, current[1])

                if child not in explored:
                    frontier.append(child)
                    explored[child] = current   # store parent

    # Reconstruct path from goal to start
    path = {}
    cell = goal
    while cell is not None:
        parent = explored[cell]
        if parent is not None:
            path[parent] = cell
        cell = parent

    return path


if __name__ == '__main__':
    m = maze(5,5)
    m.CreateMaze()
    bfsPath = BFS(m)
    a = agent(m, footprints=True, color= 'blue')
    m.tracePath({a: bfsPath})
    m.run()


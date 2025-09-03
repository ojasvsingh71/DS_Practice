from collections import deque

# Define a simple Problem class for BFS
class SimpleGraphProblem:
    def __init__(self, initial_state, goal_state, graph):
        self.initial_state = initial_state
        self.goal_state = goal_state
        self.graph = graph

    def goal_test(self, state):
        return state == self.goal_state

    def actions(self, state):
        return self.graph.get(state, [])

    def result(self, state, action):
        return action


def breadth_first_search(problem):
    node = (problem.initial_state, [], 0)  # (state, path, path_cost)
    if problem.goal_test(node[0]):
        return [node[0]]

    frontier = deque([node])  # FIFO queue
    explored = set()

    while frontier:
        state, path, cost = frontier.popleft()
        explored.add(state)

        for action in problem.actions(state):
            child_state = problem.result(state, action)
            child_path = path + [child_state]
            child_cost = cost + 1  # uniform cost here

            if child_state not in explored and all(child_state != n[0] for n in frontier):
                if problem.goal_test(child_state):
                    return [problem.initial_state] + child_path
                frontier.append((child_state, child_path, child_cost))

    return None


# === Main Program ===
if __name__ == "__main__":
    graph_example = {}

    print("Enter graph edges (press Enter without typing a node to finish):")
    while True:
        node = input("Enter node: ").strip()
        if node == "":
            break
        children = input(f"Enter children of {node} separated by commas: ").strip()
        graph_example[node] = [child.strip() for child in children.split(",") if child.strip()]

    start = input("Enter start node: ").strip()
    goal = input("Enter goal node: ").strip()

    problem_instance = SimpleGraphProblem(initial_state=start, goal_state=goal, graph=graph_example)
    solution_path = breadth_first_search(problem_instance)

    if solution_path:
        print("Solution Path:", " → ".join(solution_path))
    else:
        print("No path found")

def solveNQueens(n):
    def is_safe(board, row, col):
        # Check the left side of the current row
        for i in range(col):
            if board[row][i] == 1:
                return False

        # Check upper left diagonal
        for i, j in zip(range(row, -1, -1), range(col, -1, -1)):
            if board[i][j] == 1:
                return False

        # Check lower left diagonal
        for i, j in zip(range(row, n, 1), range(col, -1, -1)):
            if board[i][j] == 1:
                return False

        return True

    def solve(board, col):
        if col >= n:
            return True

        for i in range(n):
            if is_safe(board, i, col):
                board[i][col] = 1
                if solve(board, col + 1):
                    return True
                board[i][col] = 0  # Backtrack if no solution is found

        return False

    # Initialize the board
    board = [[0] * n for _ in range(n)]

    if solve(board, 0):
        return board
    else:
        return []


def print_board(board):
    for row in board:
        print(" ".join("Q" if cell else "." for cell in row))


n = 8 # Change this value to the desired board size
solutions = solveNQueens(n)
if solutions:
    for solution in solutions:
        print_board(solution)
else:
    print("No solution exists.")

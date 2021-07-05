# import tokenize

# with tokenize.open('list_of_py_files.py') as f:
#     tokens = tokenize.generate_tokens(f.readline)
#     for token in tokens:
#         print(token)
import tokenize

with open('list_of_py_files.py', 'rb') as f:
    tokens = tokenize.tokenize(f.readline)
    for token in tokens:
        print(token)
#ref iteration: https://stackoverflow.com/questions/10377998/how-can-i-iterate-over-files-in-a-given-directory

import argparse
import pathlib

parser = argparse.ArgumentParser(description='get the directory path')
parser.add_argument('path', type=pathlib.Path)

args = parser.parse_args()

pathlist = pathlib.Path(str(args.path)).glob('**/*.py')
f = open("ListOfPythonFilesInGivenDirectory.txt", "x")
for path in pathlist:
     # because path is object not string
     path_in_str = str(path)
     #print(path_in_str)
     f.write(path_in_str)
     f.write('\n')

f.close()

#open and read the file after the appending:
f = open("ListOfPythonFilesInGivenDirectory.txt", "r")
print(f.read())
f.close()

import csv

#import git
from git import Repo

index = 0

file = open("G:\Personal\Edu\Academics\Research Works\dataset\datasetPython1000.csv", "r")
reader = csv.reader(file, delimiter=',')
for column in reader:
    index = index + 1
    if(index > 2):
        print(column[0])
        repository = "https://github.com/"+column[0].split()[0]+".git"
        print(repository)
        #git.Git("G:\Personal\Edu\Academics\Research Works\Repos").clone("git@github.com:"+column[0]+".git")    #method 1; either do this
        Repo.clone_from("https://github.com/"+column[0]+".git", "G:\Personal\Edu\Academics\Research Works\Repos\\"+str(index))   #method 2; or do this
        print("cloned")

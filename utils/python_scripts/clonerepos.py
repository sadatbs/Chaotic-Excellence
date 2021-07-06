import requests
from git import Repo
import argparse
import pathlib

response = requests.get("https://api.github.com/search/repositories?q=language:c&sort=stars")

print("status code: ", response.status_code)

res = response.json()
data = res["items"]

i = 0

for data_item in data:
    print(data_item["html_url"])
    repository = data_item["html_url"]+".git"
    print(repository)
    #git.Git("G:\Personal\Edu\Academics\Research Works\Repos").clone("git@github.com:"+column[0]+".git")    #method 1; either do this
    Repo.clone_from(repository, "G:\Personal\Edu\Academics\Research Works\Repos\\" + data_item["html_url"].split('/')[4])   #method 2; or do this
    print("cloned")

path = "G:\Personal\Edu\Academics\Research Works\Repos"

pathlist = pathlib.Path(path).glob('**/*.c')

for path in pathlist:
     # because path is object not string
     path_in_str = str(path)
     print(path_in_str)
     




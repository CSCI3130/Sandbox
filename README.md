[![Build Status](https://travis-ci.org/CSCI3130/sandbox.png)]
(https://travis-ci.org/CSCI3130/sandbox)

[Code Coverage](https://codecov.io/github/CSCI3130/sandbox)

# Sandbox
Place to try Github related things


## Get your local copy
- Get your local copy of the source,
  `git clone https://github.com/CSCI3130/Sandbox`


## Making a change
- To make changes to the repository make sure that you have the latest version
  of the source: `git pull`

- Before making any modifications, checkout a new branch to work in `git
  checkout -b relevant-name-for-change`, this will create a new branch where
  you are free to make unlimited commits

- You are now ready to make your modifications! `$EDITOR file`

- When your modifications are made, you can get a status of what files have
  changed `git status`

- When a file is untracked add it with `git add file` or `git add -A` to track
  all the files from your current directory recursively.

- If you want to have a look at exacly what was changed, `git diff`

- When your are ready to commit a change, `git commit -m "message for your
  commit"` if you ommit the -m flag, your `$EDITOR` will be opened. Try to
  summarize the commit in 50 characters, and write any other details on a
  separate line as this will allow github to display the whole message
  efficiently

- Keep making changes and commits, until your branch goal is reached, and your
  code passes all the tests. If other people will be working on the same
  branch, make sure to push you branch to the github repository `git push -u
  origin relevant-name-for-change`


## Getting your change to the master branch
- When you're all done with the developing, rebase your branch from
  origin/master, `git rebase origin/master`

- This might cause conflicts which must be resolved before merging the
  branches. Resolve conflicts manually by editing the conflicted file(s)

- Once everything has been resolved, make sure that all the tests still pass.
  if any test fails and it has nothing to do with any code you modified,
  create a new issue on the github page. Fix any tests you can, and commit
  again

- You are now ready to push `git push -u origin relevant-name-for-change`

- Create a pull/merge request to be merged into master. There will be a code
  review phase by the repository admin and your branch will be merged with
  master


# Maven
Please install maven (as it will be taught during the course).
We will be using it to automate the compilation in an IDE independent way, and
to help with the testing setup.

## If on the command line
- To build a maven project, `mvn package`

- To test, `mvn test`

- To clean, `mvn clean`

Feel free to test out things and modify this App in your own branch, and try
out pull requests.


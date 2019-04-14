#!/bin/bash
find *.java -type f -print0 | while IFS= read -r -d $'\0' file; do
	javac "$file"
done

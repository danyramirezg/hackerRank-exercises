#!/usr/bin/python3

import sys

"""
Given n names and phone numbers, assemble a phone book that maps friends' names to their respective
phone numbers. You will then be given an unknown number of names to query your phone book for.
For each  queried, print the associated entry from your phone book on a new line in the form
name=phoneNumber; if an entry for name is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.

Input Format

The first line contains an integer, n, denoting the number of entries in the phone book.
Each of the n subsequent lines describes an entry in the form of 2 space-separated values on a
single line. The first value is a friend's name, and the second value is an -digit phone number.

After the n lines of phone book entries, there are an unknown number of lines of queries. Each line
(query) contains a  to look up, and you must continue reading lines until there is no more input.

Note: Names consist of lowercase English alphabetic letters and are first names only.
"""

n = int(sys.stdin.readline().strip())

directory = dict()

for i in range(n):
    input_user = sys.stdin.readline().strip().split(' ')
    directory[input_user[0]] = input_user[1]

query = sys.stdin.readline().strip()

while query:
    phone = directory.get(query)

    if phone:
        print(query + '=' + phone)
    else:
        print("Not found")

    query = sys.stdin.readline().strip()
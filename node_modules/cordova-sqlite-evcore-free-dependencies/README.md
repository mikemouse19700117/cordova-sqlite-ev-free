# Cordova-sqlite-evcore-free-dependencies

AUTHOR: Christopher J. Brody

LICENSE: GPL v3 (http://www.gnu.org/licenses/gpl.txt) or commercial license options

Contains source and object code built from:
- Android-sqlite-evcore-native-driver-free (GPL v3 or commercial license options)
- SQLite3 (public domain)

This project provides the following dependencies needed to build Cordova-sqlite-evcore-fre:
- `sqlite3.h`, `sqlite3.c` - SQLite `3.15.2` amalgamation needed to build iOS and Windows versions
- `libs` - Android-sqlite-evcore-native-driver-free NDK libraries built with SQLite `3.15.2` amalgamation with the following flags:
 - `-DSQLITE_TEMP_STORE=2`
 - `-DSQLITE_THREADSAFE=2`
 - `-DSQLITE_ENABLE_FTS3`
 - `-DSQLITE_ENABLE_FTS3_PARENTHESIS`
 - `-DSQLITE_ENABLE_FTS4`
 - `-DSQLITE_ENABLE_RTREE`

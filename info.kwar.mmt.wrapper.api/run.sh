#!/bin/bash
ant clean
ant
ant jar
cp lib/*.jar ../MMTProject/lib/

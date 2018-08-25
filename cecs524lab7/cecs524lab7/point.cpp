#include "stdafx.h"

#include <stdlib.h>
#include <time.h>
#include <iostream>
#include <string>
#include "point.h"
using namespace std;

point::point() {
	xcord = 0.0;
	ycord = 0.0;
}

point::point(double x, double y) {
	xcord = x;
	ycord = y;
}


void point::display() {
	cout << "x is"<< xcord << endl;
	cout << "y is" << ycord << endl;
}


void point::incrPoint(int N, int M) {
	xcord = xcord + N;
	ycord = ycord + M;
}

void point::decrPoint(int N, int M)
{
	xcord = xcord - N;
	ycord = ycord - M;
}
double point::getXcord() {
	return xcord;
}
double point::getYcord() {
	return ycord;
}

double point::getXcord() const{
	return xcord;
}
double point::getYcord() const {
	return ycord;
}

void point::setXcord(double value) {
	xcord = value;
}

void point::setYcord(double value) {
	ycord = value;
}

double point::distanceBetween(point T) {
	double distance;
	double xdistance = pow(abs(xcord - T.getXcord()), 2);
	double ydistance = pow(abs(ycord - T.getYcord()), 2);

	distance = sqrt(xdistance + ydistance);

	return distance;
}

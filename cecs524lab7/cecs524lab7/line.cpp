
#include "stdafx.h"
#include <stdlib.h>
#include <iostream>
#include <string>
#include "line.h"
using namespace std;
// default constructor for line
line::line() {
	u.setXcord(0.0);
	u.setYcord(0.0);
	v.setXcord(0.0);
	v.setYcord(0.0);
}
//overloaded constructor for line
line::line(point &U, point &V) {
	u.setXcord(U.getXcord());
	u.setYcord(U.getYcord());
	v.setXcord(V.getXcord());
	v.setYcord(V.getYcord());
}


// – return u
point line::getU() {
	return u;
}
point line::getU() const {
	return u;
}
// – return v
point line::getV() {
	return v;
}
point line::getV() const {
	return v;
}

void line::SetPoint1(double x, double y) {
	u.setXcord(x);
	u.setYcord(y);
}

void line::SetPoint2(double x, double y) {
	v.setXcord(x);
	v.setYcord(y);
}

void line::SetLine(double xU, double yU, double xV, double yV) {
	u.setXcord(xU);
	u.setYcord(yU);
	v.setXcord(xV);
	v.setYcord(yV);
}

// operator overloading ==
bool	line::operator== (const	line &rhs) {
	if (u.getXcord() == rhs.getU().getXcord() && u.getYcord() == rhs.getU().getYcord()
		&& v.getXcord() == rhs.getV().getXcord() && v.getYcord() == rhs.getV().getYcord() ) {
		return true;
	}
	else {
		return false;
	}
}

// operator overloading !=
bool	line::operator!= (const	line &rhs) {
	if (u.getXcord() != rhs.getU().getXcord() || u.getYcord() != rhs.getU().getYcord()
		|| v.getXcord() != rhs.getV().getXcord() || v.getYcord() != rhs.getV().getYcord()) {
		return true;
	}
	else {
		return false;
	}
}

ostream& operator<< (ostream &outstream, line &rhs) {
	rhs.ShowLine(outstream);
	return outstream;
}

double line::distance(line &rhs) {
	double smallest = 0;
	double temp = 0;
	double dis1 = u.distanceBetween(rhs.getU());
	double dis2 = u.distanceBetween(rhs.getV());
	double dis3 = v.distanceBetween(rhs.getU());
	double dis4 = v.distanceBetween(rhs.getV());

	//cout << dis1 <<","<< dis2 <<","<< dis3 <<","<< dis4 << endl;

	double dis[] = {dis1, dis2, dis3, dis4};
	smallest = dis[0];

	for (int i = 0; i < 4; i++) {
		temp = dis[i];
		if (temp < smallest) {
			smallest = temp;
		}
	}

	return smallest;
}

double line::slope() {
	if (u.getYcord() > v.getYcord() && u.getXcord() != v.getXcord()) {
		return ((u.getYcord() - v.getYcord()) / (v.getXcord() - u.getXcord()));
	}
	else if (u.getYcord() < v.getYcord() && u.getXcord() != v.getXcord()) {
		return ((v.getYcord() - u.getYcord()) / (u.getXcord() - v.getXcord()));
	}
	else if (u.getYcord() == v.getYcord()) {
		return 0.0;
	}
	else if (u.getXcord() == v.getXcord()) {
		return 90.0;
	}
	else {
		return -1.0;
	}
}

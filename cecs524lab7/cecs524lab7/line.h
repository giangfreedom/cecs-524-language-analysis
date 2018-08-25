#ifndef line_h
#define line_h
#include <stdlib.h>
#include <iostream>
#include <string>
#include "point.h"
using namespace std;
class line
{
private:
	point u;
	point v;

public:
	// default constructor for line
	line();
	//overloaded constructor for point
	line(point &U, point &V);

	// ret point u
	point getU();
	point getU() const;
	// ret point v
	point getV();
	point getV() const;

	// set point1 (set U)
	void SetPoint1(double x, double y);
	//set point2 (set V)
	void SetPoint2(double x, double y);
	//set line
	void SetLine(double xU, double yU, double xV, double yV);

	// operator overloading ==
	bool	operator== (const	line &rhs);
	// operator overloading !=
	bool	operator!= (const	line &rhs);

	// operator overloading <<
	friend ostream& operator<< (ostream &outstream, line &rhs);

	// out put the date in string
	void ShowLine(ostream &outstream = cout) {
		outstream << "((" << u.getXcord() << "," << u.getYcord() << ") (" << v.getXcord() << "," << v.getYcord() << "))" << endl;
	}
	
	double distance(line &rhs);
	double slope();
};

#endif
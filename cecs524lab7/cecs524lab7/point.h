#ifndef point_h
#define point_h

class point
{
private:
	double	xcord;
	double  ycord;

public:
	// default constructor set x and y cord to 0.0 and 0.0
	point();
	//overloaded constructor This will set the point to the values 
	point(double x, double y);

	// display the point x and y value
	void display();
	// – increment the point by N value for xcord and M value for ycord.
	void incrPoint(int N, int M);
	//decrement the point by N value for xcord and M value for ycord.
	void decrPoint(int N, int M);

	// return the distance between 2 point.
	double distanceBetween(point T);

	// – return the xcord
	double getXcord();
	// – return the xcord
	double getXcord() const;
	// – return the ycord
	double getYcord();
	// – return the ycord
	double getYcord() const;

	// set x cord
	void setXcord(double value);
	//set y cord
	void setYcord(double value);
};

#endif
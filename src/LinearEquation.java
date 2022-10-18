public class LinearEquation {
   //declared instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
//distance formula to find the distance in rounded form
    public double distance(){
        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return roundedToHundredth(distance);
    }


   //finds y intercept and returns in rounded form
    public double yIntercept(){
        double yIntercept = y2-(x2*slope());
        return roundedToHundredth(yIntercept);
    }


    // finds the slope in rounded form
    public double slope(){
        double slope = (double)(y2-y1)/(x2-x1);
        return roundedToHundredth(slope);
    }


// finds the equation with a bunch of conditions to make what the ideal equation should look
    public String equation(){
        if (slope()==0) {
            if (yIntercept() < 0) {
                return "y = -" + Math.abs(yIntercept());
            }
            if (yIntercept() > 0) {
                return "y = " + Math.abs(yIntercept());
            }
            if (yIntercept() == 0) {
                return "y = 0";
            }
        }
        if (slope()==1) {
            if (yIntercept() < 0) {
                return "y = x-" + Math.abs(yIntercept());
            }
            if (yIntercept() > 0) {
                return "y = x+" + Math.abs(yIntercept());
            }
            if (yIntercept() == 0) {
                return "y = x";
            }
        }
        if (slope()==-1) {
            if (yIntercept() < 0) {
                return "y = -x-" + Math.abs(yIntercept());
            }
            if (yIntercept() > 0) {
                return "y = -x+" + Math.abs(yIntercept());
            }
            if (yIntercept() == 0) {
                return "y = -x";
            }
        }
        if ((y2-y1)%(x2-x1)==0){
            if (yIntercept() < 0) {
                return "y = " + ((y2 - y1) / (x2 - x1)) + "x-" + Math.abs(yIntercept());
            }
        }
            if (yIntercept() > 0) {
                return "y = " + ((y2 - y1) / (x2 - x1)) + "x+" + Math.abs(yIntercept());
            }
            if (yIntercept() == 0) {
            return "y = " + ((y2 - y1) / (x2 - x1)) + "x";
        }
        if (x2 - x1 < 0 && y2 - y1 < 0) {
            int perfectSlopeY = Math.abs(y2 - y1);
            int perfectSlopeX = Math.abs(x2 - x1);
            if (yIntercept() < 0) {
                String sign = "-";
                return "y = " + perfectSlopeY + "/" + perfectSlopeX +"x"+ sign + Math.abs(yIntercept());
            }
            if (yIntercept() > 0) {
                String sign = "+";
                return "y = " + perfectSlopeY + "/" + perfectSlopeX +"x"+ sign + Math.abs(yIntercept());
            }
            if (yIntercept() == 0) {
                return "y = " + perfectSlopeY + "/" + perfectSlopeX+"x";
            }

        }
        if (x2 - x1 < 0 && y2 - y1 > 0) {
            if (yIntercept() < 0) {
                String sign = "-";
                return "y = " + -1 * (y2 - y1) + "/" + Math.abs(x2 - x1) +"x"+ sign + Math.abs(yIntercept());
            }
            if (yIntercept() > 0) {
                String sign = "+";
                return "y = " + -1 * (y2 - y1) + "/" + Math.abs(x2 - x1) +"x"+ sign + Math.abs(yIntercept());
            }
            if (yIntercept() == 0) {
                return "y = " + -1 * (y2 - y1) + "/" + Math.abs(x2 - x1)+"x";
            }
        }
        if (x2 - x1 > 0 && y2 - y1 > 0) {
            if (yIntercept() < 0) {
                String sign = "-";
                return "y = " + (y2 - y1) + "/" + (x2 - x1) +"x"+ sign + Math.abs(yIntercept());
            }
            if (yIntercept() > 0) {
                String sign = "+";
                return "y = " + (y2 - y1) + "/" + (x2 - x1) +"x"+ sign + Math.abs(yIntercept());
            }
            if (yIntercept() == 0) {
                return "y = " + (y2 - y1) + "/" + (x2 - x1)+"x";
            }
        }
        if (x2 - x1 > 0 && y2 - y1 < 0) {
            if (yIntercept() < 0) {
                String sign = "-";
                return "y = " + (y2 - y1) + "/" + (x2 - x1) +"x"+ sign + Math.abs(yIntercept());
            }
            if (yIntercept() > 0) {
                String sign = "+";
                return "y = " + (y2 - y1) + "/" + (x2 - x1) +"x"+ sign + Math.abs(yIntercept());
            }
            if (yIntercept() == 0) {
                return "y = " + (y2 - y1) + "/" + (x2 - x1)+"x";
            }
        }
        return "Error";
    }
// finds the y coordinate for the x value the user inputs
    public String coordinateForX(double xValue){
            double y = xValue * slope() + yIntercept();
            return "(" + xValue + ", " + y+")";
    }
//code for the rounded to hundredths place
    public double roundedToHundredth(double toRound){
        return (double)Math.round(100*toRound)/100;
    }


// prints all required lines for the code which is used in the runner class.
    public String lineInfo(){
        return  "The original points: ("+x1+","+y1+") and ("+x2+","+y2+")\n" +
                "The equation of the line between these points is "+equation()+"\n" +
                "The slope of this line is "+slope()+"\n" +
                "The y-intercept of this line is: "+yIntercept()+"\n" +
                "The distance between the two points is: "+ distance();
    }

}

























public class Exercise {
public static void main(String[] args) { 

boolean isRaining = true;

if (isRaining) {
  System.out.println("Remember to take n umbrella!");
} else {
System.out.println("No need for an umbrella.");
}

int numericGrade = 78;
boolean isPassed = true;
char letterGrade = 'Z';

if (numericGrade <= 0) { // fulfill ?
    throw new IllegalArgumentException("Grade must be larger than zero!");
}

if (numericGrade >= 50) { // fulfill ?
    isPassed = true;
} else {
    isPassed = false;
}

// What's next?
if (numericGrade >= 90) {
    letterGrade = 'A';
} else if (numericGrade >= 80) {
    letterGrade = 'B';
} else if (numericGrade >= 70) {
    letterGrade = 'C';
} else if (numericGrade >= 60) {
    letterGrade = 'D';
} else if (numericGrade >= 50) {
    letterGrade = 'E';
} else {
    letterGrade = 'F';
}

System.out.println("isPassed: " + isPassed); // isPassed = ?
System.out.println("numericGrade: " + numericGrade); // numericGrade = ?
System.out.println("letterGrade: " + letterGrade); // letterGrade = ?


int numbericGrade1 = 20;
char letterGrade1 = ' ';

switch (numbericGrade1) {
    case 90: {
        letterGrade1 = 'A';
    }
    case 80: {
        letterGrade1 = 'B';
    }
    case 70: {
        letterGrade1 = 'C';
    }
    case 60: {
        letterGrade1 = 'D';
    }
    case 50: {
        letterGrade1 = 'E';
    }
    default: {
        letterGrade1 = 'F';
    }
}

System.out.println("letterGrade: " + letterGrade1); // letterGrade = ?
}




}

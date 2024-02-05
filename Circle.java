/* Fady Zaki SDEV200 2/3/24
---------------------       ---------------------        ----------------
|      Circle       | ----> |  GeometricObject  |   <--- |   Comparable  |
---------------------       ---------------------        ----------------
| - radius: double  |       |                   |        | + compareTo() |
|-------------------|       |-------------------|        ----------------
| + Circle()        |       | + getArea(): double |
| + Circle(radius:  |       | + getPerimeter():  |
| double)           |       | double              |
| + getRadius():    |       |                   |
| double            |       |                   |
| + setRadius(radius:|       |                   |
| double): void     |       |                   |
| + compareTo(other:|       |                   |
| Circle): int      |       |                   |
| + equals(obj:     |       |                   |
| Object): boolean  |       |                   |
| + hashCode(): int |       |                   |
---------------------       ---------------------
*/
import java.util.Objects;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
  
    public int hashCode() {
        return Objects.hash(radius);
    }
}

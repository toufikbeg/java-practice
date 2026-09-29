public class LogicalOperators {
    public static void main(String[] args) {
        boolean hasDegree = true;
        boolean hasExperience = false;
        System.out.println("AND: " + (hasDegree && hasExperience));
        System.out.println("OR: " + (hasDegree || hasExperience));
        System.out.println("NOT of degree: " + (!hasDegree));
    }
}

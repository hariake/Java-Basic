package pakett1;

public class Thing {
        private String name;
        private int weight;

        public Thing(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public java.lang.String toString() {
            return name + "(" + weight + "kg)";
        }

        public static void main(String[] args) {
            Thing raamat = new Thing("vahtramäe Emil", 10);
            Thing mobla = new Thing("iphone", 20);

            System.out.println("raamatu nimi on " + raamat.getName());
            System.out.println("raamat kaalub " + mobla.getWeight() +" kilogrammi!");

            System.out.println("raamat: " + raamat);
            System.out.println("mobla: " + mobla);
        }
    }


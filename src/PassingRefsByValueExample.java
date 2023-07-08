public class PassingRefsByValueExample {
    public static void main(String[] args) {
        // Let's create a cat
        Object cat = new Object() {
            @Override
            public String toString() {
                return "I'm a cat";
            }
        };
        // and a dog
        Object dog = new Object() {
            @Override
            public String toString() {
                return "I'm a dog";
            }
        };
        // make sure the cat is a cat and the dog is a dog
        System.out.printf("Before refsChanger cat says: \"%s\"%n", cat);
        System.out.printf("Before refsChanger dog says: \"%s\"%n", dog);

        // let's change cat reference on dog reference by method
        refsChanger(cat, dog);

        // now despite reference changes within method, cat remains a cat
        System.out.printf("After  refsChanger cat says: \"%s\"%n", cat);
    }

    public static void refsChanger(Object cat, Object dog) {
        System.out.println("-----------refsChanger begins-----------");
        cat = dog; // We change cat reference on dog reference in method
        System.out.printf("In the linksChanger cat says: \"%s\"%n", cat);
        System.out.println("------------refsChanger ends------------");
    }
}

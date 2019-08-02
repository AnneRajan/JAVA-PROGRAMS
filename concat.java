public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System .out.println("Enter the first string:");
        s1=sc.nextLine();
        System.out.println("Entere the second string:");
        s2=sc.nextLine();
        String s3=s1.concat(s2);
        System.out.println("Concatenated String: "+s3);
    }

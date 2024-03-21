
        int id=scn.nextInt();
        scn.nextLine();
        System.out.println("Name: ");
        String name=scn.nextLine();
        System.out.println("Salary: ");
        double salary=scn.nextDouble();

        Employee emp= new Employee(id,name,salary);

        double annualSalary=emp.calculateAnnualSalary();
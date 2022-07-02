package StudentManagement;
        public class Main {
            public static void main(String[] args) {

                Course mat = new Course("Matematik", "MAT101", "MAT");
                Course fizik = new Course("Fizik", "FZK101", "FZK");
                Course kimya = new Course("Kimya", "KMY101", "KMY");

                Teacher t1 = new Teacher("Arif Hoca", "00000002", "MAT");
                Teacher t2 = new Teacher("Tarik Hoca", "00000003", "FZK");
                Teacher t3 = new Teacher("Umran Hoca", "00000003", "KMY");

                mat.addTeacher(t1);
                fizik.addTeacher(t2);
                kimya.addTeacher(t3);
                fizik.printTeacher();

                Student s1 = new Student("Serra", 4, "12345", mat, fizik, kimya);
                s1.addBulkExamNote(30,20,40);
                s1.isPass();

                Student s2 = new Student("Merve", 4, "123456", mat, fizik, kimya);
                s2.addBulkExamNote(90,60,50);
                s2.isPass();

                Student s3 = new Student("Hakan", 4, "1234567", mat, fizik, kimya);
                s3.addBulkExamNote(70,10,60);
                s3.isPass();

            }
        }


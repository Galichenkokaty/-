public class Abiturient {
        private  int  id;
        private  String surname;
        private  String name;
        private String patronymic;
        private String adress;
        private  int phone;
        private int appraisals;

        public Abiturient(int id,
                    String surname,
                    String name,
                    String patronymic,
                    String adress,
                    int phone,
                    int appraisals,){

            this.id = id;
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.adress = adress;
            this.phone = phone;
            this.appraisals = appraisals;

        }


        public int getId() { return id; }

        public String getSurname() { return surname; }

        public String getName() { return name; }

        public String getPatronymic() { return patronymic; }

        public String getAdress() { return adress; }

        public int getPhone() { return phone; }

        public int getAppraisals() { return appraisals; }

        public void setId(int id) { this.id = id; }

        public void setSurname(String surname) { this.surname = surname; }

        public void setName(String name) { this.name = name; }

        public void setPatronymic(String patronymic) { this.patronymic = patronymic; }

        public void setAdress(String adress) { this.adress = adress; }

        public void setPhone(int phone) { this.phone = phone; }

        public void setAppraisals(int appraisals) { this.appraisals = appraisals; }



        @Override
        public String toString() {
            return "Abiturient {" +
                    "id='" + id + '\'' +
                    ", surname='" + surname + '\'' +
                    ", name =" + name + '\'' +
                    ", patronymic =" + patronymic + '\'' +
                    ",adress = " + adress + '\'' +
                    ",phone = " + phone + '\'' +
                    ",appraisals = " + appraisals + '\'' +
                    '}';
        }


    }



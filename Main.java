public class Main {
    public static void main(String[] args) {
        //������1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        }

        //������ 2
        long clientDeviceYear = 2015L;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");

        }

        //������ 3
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("��� " + year + " �������� ����������");
        } else {
            System.out.println("��� " + year + " �������� �� ����������");
        }

        //������ 4
        int deliveryDistance = 19;
        if (deliveryDistance <= 20) {
            System.out.println("����������� ���� ����");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 100) {
            System.out.println("����������� ��� ���");
        }
        if (deliveryDistance > 60 && deliveryDistance >= 100) {
            System.out.println("����������� ��� ���");
        }

        //������ 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("����");
                break;
            case 2:
                System.out.println("����");
                break;
            case 3:
                System.out.println("�����");
                break;
            case 4:
                System.out.println("�����");
                break;
            case 5:
                System.out.println("�����");
                break;
            case 6:
                System.out.println("����");
                break;
            case 7:
                System.out.println("����");
                break;
            case 8:
                System.out.println("����");
                break;
            case 9:
                System.out.println("�����");
                break;
            case 10:
                System.out.println("�����");
                break;
            case 11:
                System.out.println("�����");
                break;
            case 12:
                System.out.println("����");
                break;
            default:
                System.out.println("������ ������ �� ����������");
        }
    }
}
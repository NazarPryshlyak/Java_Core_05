package animal8v1;

public abstract class Pet {
	
	/*�������� ���� ����������� Pet , � ����� ������� ����������� ����� voice(). 
	�������� ����� Cow, Cat, Dog , �� ����������� �� Pet. ������������� � ��� ����� voice(),
	���, ��� ���������� ���� � ����� main, �� ������� ���������� : �� ��- �����-�����, 
	�� ���-�����-�����, �� ������- ����-����.
    */


    private String name;
	
	public Pet(String name) {
		this.name = name;
	}

	abstract void voice();

	public String getName() {
		return name;
	}
}

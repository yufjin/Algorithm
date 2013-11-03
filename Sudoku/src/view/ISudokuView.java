package view;

public interface ISudokuView {
	public void setDefaultValue(int i,int j,int value);
	public void getValue(int i,int j);
	public void setPossibilities(int i,int j,int[] possibilities);
}

import java.awt.*;
class FrameWControls extends Frame {
	public static void main(String args[]) {
		FrameWControls fwc = new FrameWControls();
		fwc.setLayout(new FlowLayout()); 
		fwc.setSize(800, 300);
		fwc.add(new Button("Test Me!"));
		fwc.add(new Label("Label"));
		fwc.add(new TextField());
		CheckboxGroup cbg = new CheckboxGroup();
		fwc.add(new Checkbox("chk1", cbg, true));
		fwc.add(new Checkbox("chk2", cbg, true));
		fwc.add(new Checkbox("chk3", cbg, false));
		List list = new List(3, false);
		list.add("MTV");
		list.add("V");
		fwc.add(list);
		Checkbox cb = new Checkbox();
		fwc.add(new Checkbox("cb1"));
		fwc.add(new Checkbox("cb2"));
		fwc.add(new Checkbox("cb3"));
		Choice chooser = new Choice();
		chooser.add("Spiderman");
		chooser.add("Batman");
		chooser.add("Superman");
		fwc.add(chooser);
		fwc.add(new TextArea());
		fwc.add(new Scrollbar());
		fwc.setVisible(true);
	}
}
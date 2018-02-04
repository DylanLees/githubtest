package test1;

/**
 * ����ʽ����ģʽ
 * 
 * @author Administrator
 *
 */
public class LazyManModel {
	private LazyManModel() {

	}

	private static LazyManModel lazyManModel = null;

	public LazyManModel getInstance() {
		if (lazyManModel == null) {
			
			lazyManModel = new LazyManModel();
		}
		return lazyManModel;
	}
}

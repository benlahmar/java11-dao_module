import com.dao.IDao;
import com.dao.imp.DaoImpl;
import com.dao.imp.DaoImplXml;

module com.dao {
	requires com.moel;
	exports com.dao;
	
	//fournisseur de l'implementation de l 'interface
	provides IDao with DaoImpl, DaoImplXml;
}
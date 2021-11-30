import com.dao.IDao;
import com.dao.IDaog;
import com.dao.IQuizDao;
import com.dao.IUser;
import com.dao.imp.DaoImpl;
import com.dao.imp.DaoImplXml;
import com.dao.imp.QuizDao;
import com.dao.imp.UserDao;

module com.dao {
	requires com.moel;
	exports com.dao;
	requires com.app.quiz;
	//fournisseur de l'implementation de l 'interface
	provides IDao with DaoImpl;
	provides IUser with UserDao;
	provides IQuizDao with QuizDao;
	provides IDaog with DaoImplXml;
	
}
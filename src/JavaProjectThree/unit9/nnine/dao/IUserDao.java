package JavaProjectThree.unit9.nnine.dao;
import JavaProjectThree.unit9.nnine.domain.User;

/**
 * 用户操作接口（IUserDao）:
 *  包含
 *  添加用户（注册功能）、
 *  查找用户（登录功能）、
 *  用户（重置密码）三 种抽象方法
 */
public interface IUserDao {
    // 添加用户（注册功能），添加用户（注册功能）
    /**
     * 添加用户（注册功能），模拟键盘输入一个用户（注册功能）
     * @return 当前输入的用户对象
     */
    User addUser();
    // 查找用户（登录功能）
    /**
     *
     * @param loginUser 登录用户对象
     * @return 成功与否
     */
    boolean loginUser(User loginUser);
    //用户（重置密码）
    /**
     * 重置功能
     * @param user 用户名
     * @return
     */
    boolean updateUser(User user);



}
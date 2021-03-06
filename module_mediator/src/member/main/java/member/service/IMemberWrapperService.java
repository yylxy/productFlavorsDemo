package member.service;

/**
 * 会员服务包装
 */
public interface IMemberWrapperService {

    /**
     * 会员UI服务
     *
     * @return {@link IMemberViewService}
     */
    IMemberViewService getMemberViewService();

    /**
     * 会员数据服务
     *
     * @return {@link IMemberDataService}
     */
    IMemberDataService getMemberService();
}

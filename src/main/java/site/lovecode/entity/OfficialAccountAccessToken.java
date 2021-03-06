package site.lovecode.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import site.lovecode.common.mybatis.Identity;

@Table(name = "wx_official_account_access_token")
public class OfficialAccountAccessToken implements Identity, Serializable {
    @Id
    private Long id;

    /**
     * 微信公众号基本信息id，关联微信公众号基本信息表
     */
    private Long officialAccountId;

    /**
     * 微信的appid
     */
    private String appid;

    /**
     * 有效期
     */
    private Long expiresIn;

    /**
     * 微信公众号的accessToken
     */
    private String accessToken;

    /**
     * 记录创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取微信公众号基本信息id，关联微信公众号基本信息表
     *
     * @return officialAccountId - 微信公众号基本信息id，关联微信公众号基本信息表
     */
    public Long getOfficialAccountId() {
        return officialAccountId;
    }

    /**
     * 设置微信公众号基本信息id，关联微信公众号基本信息表
     *
     * @param officialAccountId 微信公众号基本信息id，关联微信公众号基本信息表
     */
    public void setOfficialAccountId(Long officialAccountId) {
        this.officialAccountId = officialAccountId;
    }

    /**
     * 获取微信的appid
     *
     * @return appid - 微信的appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置微信的appid
     *
     * @param appid 微信的appid
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取有效期
     *
     * @return expiresIn - 有效期
     */
    public Long getExpiresIn() {
        return expiresIn;
    }

    /**
     * 设置有效期
     *
     * @param expiresIn 有效期
     */
    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * 获取微信公众号的accessToken
     *
     * @return accessToken - 微信公众号的accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 设置微信公众号的accessToken
     *
     * @param accessToken 微信公众号的accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 获取记录创建时间
     *
     * @return createTime - 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间
     *
     * @param createTime 记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", officialAccountId=").append(officialAccountId);
        sb.append(", appid=").append(appid);
        sb.append(", expiresIn=").append(expiresIn);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
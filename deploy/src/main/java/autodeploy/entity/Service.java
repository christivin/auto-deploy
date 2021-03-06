package autodeploy.entity;

import java.util.List;

public class Service {
    /**
     * 服务名
     */
    private String serviceName;
    /**
     * 部署主机集合
     */
    private List<Host> serviceHosts;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<Host> getServiceHosts() {
        return serviceHosts;
    }

    public void setServiceHosts(List<Host> serviceHosts) {
        this.serviceHosts = serviceHosts;
    }
}

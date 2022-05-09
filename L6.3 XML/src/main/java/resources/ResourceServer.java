package resources;

public class ResourceServer implements ResourceServerMBean{
    private TestResource testResource;

    public ResourceServer() {
        this.testResource = new TestResource();
    }

    public ResourceServer(TestResource testResource) {
        this.testResource = testResource;
    }

    @Override
    public String getName() {
        return testResource.getName();
    }

    @Override
    public int getAge() {
        return testResource.getAge();
    }

    public void setTestResource(TestResource testResource) {
        this.testResource = testResource;
    }
}

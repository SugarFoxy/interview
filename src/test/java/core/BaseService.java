package core;

abstract public class BaseService {

    protected static BaseStorage baseStorage;

    public static void setBaseStorage(BaseStorage baseStorage) {
        BaseService.baseStorage = baseStorage;
    }
}

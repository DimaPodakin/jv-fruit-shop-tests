package basesyntax.strategy;

import basesyntax.dao.StorageDao;
import basesyntax.model.FruitTransaction;

public class SupplyOperationHandlerImpl implements OperationHandler {
    private final StorageDao storageDao;

    public SupplyOperationHandlerImpl(StorageDao storageDao) {
        this.storageDao = storageDao;
    }

    @Override
    public void changeQuantity(FruitTransaction fruitTransaction) {
        storageDao.updateData(fruitTransaction.getFruit(),
                storageDao.getRemainFruit(fruitTransaction.getFruit())
                        + fruitTransaction.getQuantity());
    }
}

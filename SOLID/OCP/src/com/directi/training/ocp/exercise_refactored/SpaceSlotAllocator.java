package com.directi.training.ocp.exercise_refactored;

public class SpaceSlotAllocator extends ResourceAllocator{
    @Override
    protected int findFreeSlot() {
        return 0;
    }

    @Override
    protected void markSlotBusy(int resourceId) {

    }

    @Override
    protected void markSlotFree() {

    }
}

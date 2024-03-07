package com.directi.training.ocp.exercise_refactored;

import com.directi.training.ocp.exercise.ResourceType;

public abstract class ResourceAllocator {




    public int allocate()
    {
        int resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }

    protected abstract int findFreeSlot();


    protected abstract void markSlotBusy(int resourceId);

    protected abstract void markSlotFree();


}

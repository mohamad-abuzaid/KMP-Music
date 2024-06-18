//
//  LifecycleHolder.swift
//  iosApp
//
//  Created by Abuzaid on 29/03/2023.
//

import shared

class LifecycleHolder : ObservableObject {
    let lifecycle: LifecycleRegistry
    
    init() {
        lifecycle = LifecycleRegistryKt.LifecycleRegistry()
    
        lifecycle.onCreate()
    }
    
    deinit {
        lifecycle.onDestroy()
    }
}

//
//  ContentView.swift
//  iosApp
//
//  Created by Abuzaid on 29/03/2023.
//

import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    var lifecycleRegistyr: LifecycleHolder

    func makeUIViewController(context: Context) -> UIViewController {
        Main_iosKt.MainiOS(lifecycle: lifecycleRegistyr.lifecycle)
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var lifecycleRegistyr: LifecycleHolder
    var body: some View {
        ComposeView(lifecycleRegistyr:lifecycleRegistyr)
                .ignoresSafeArea() // Compose has own keyboard handler
    }
}



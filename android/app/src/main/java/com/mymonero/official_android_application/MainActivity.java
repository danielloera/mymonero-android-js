package com.mymonero.official_android_application;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Plugin;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.dutchconcepts.capacitor.barcodescanner.BarcodeScanner;
import com.whitestein.securestorage.SecureStoragePlugin;
import de.einfachhans.fileselect.FileSelectPlugin;

import java.util.ArrayList;


public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Initializes the Bridge
    this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
      // Additional plugins you've installed go here
      // Ex: add(TotallyAwesomePlugin.class);
      add(BarcodeScanner.class);
      add(FileSelectPlugin.class);
      add(FilesystemPlugin.class);
      add(SecureStoragePlugin.class);
    }});
  }
}

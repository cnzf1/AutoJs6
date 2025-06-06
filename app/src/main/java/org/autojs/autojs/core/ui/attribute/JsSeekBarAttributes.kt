package org.autojs.autojs.core.ui.attribute

import android.view.View
import org.autojs.autojs.core.ui.inflater.ResourceParser
import org.autojs.autojs.core.ui.widget.JsSeekBar
import org.autojs.autojs.runtime.ScriptRuntime

class JsSeekBarAttributes(scriptRuntime: ScriptRuntime, resourceParser: ResourceParser, view: View) : SeekBarAttributes(scriptRuntime, resourceParser, view) {

    override val view = super.view as JsSeekBar

}

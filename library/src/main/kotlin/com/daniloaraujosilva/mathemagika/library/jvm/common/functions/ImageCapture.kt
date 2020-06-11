package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCapture
 *
 * Full name:        System`ImageCapture
 *
 * Usage:            ImageCapture[] opens a graphical user interface for capturing images from connected cameras.
 *
 *                   CaptureRunning -> True
 *                   FrameRate -> Automatic
 *                   ImageCaptureFunction -> Automatic
 *                   ImagePreviewFunction -> Identity
 *                   ImageSize -> Automatic
 *                   ImagingDevice :> $ImagingDevice
 * Options:          RasterSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCapture
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCapture.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun imageCapture(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCapture", arguments.toMutableList(), options)
}

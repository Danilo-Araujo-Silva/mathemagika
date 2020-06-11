package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BarcodeRecognize
 *
 * Full name:        System`BarcodeRecognize
 *
 *                   BarcodeRecognize[image] recognizes a barcode in image and returns it as a string.
 *                   BarcodeRecognize[image, "prop"] returns the specified property of the barcode.
 * Usage:            BarcodeRecognize[image, "prop", format] recognizes barcodes of the specified format only.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BarcodeRecognize
 * Documentation:    web: http://reference.wolfram.com/language/ref/BarcodeRecognize.html
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
fun barcodeRecognize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BarcodeRecognize", arguments.toMutableList(), options)
}

package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BarcodeImage
 *
 * Full name:        System`BarcodeImage
 *
 *                   BarcodeImage["string", format] generates a barcode image of "string" in the specified format.
 * Usage:            BarcodeImage["string", format, size] attempts to generate a barcode image of the specified size.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BarcodeImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/BarcodeImage.html
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
fun barcodeImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BarcodeImage", arguments.toMutableList(), options)
}

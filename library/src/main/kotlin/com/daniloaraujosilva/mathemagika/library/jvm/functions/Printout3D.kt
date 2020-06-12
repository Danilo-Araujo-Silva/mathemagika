package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Printout3D
 *
 * Full name:        System`Printout3D
 *
 *                   Printout3D[model] prints out the 3D model using a 3D print previewer.
 *                   Printout3D[model, service] prints out the 3D model using the specified 3D printing service.
 * Usage:            Printout3D[model, "file.ext"] saves a print-ready form of the model to a file in the format indicated by the file extension ext.
 *
 *                   Material -> Automatic
 *                   Method -> Automatic
 *                   RegionSize -> Automatic
 *                   TargetUnits -> Automatic
 * Options:          Printout3DPreviewer :> $Printout3DPreviewer
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Printout3D
 * Documentation:    web: http://reference.wolfram.com/language/ref/Printout3D.html
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
fun printout3D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Printout3D", arguments.toMutableList(), options)
}

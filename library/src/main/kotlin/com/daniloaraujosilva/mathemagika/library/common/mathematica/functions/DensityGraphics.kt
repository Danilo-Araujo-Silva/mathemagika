package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DensityGraphics
 *
 * Full name:        System`DensityGraphics
 *
 * Usage:            DensityGraphics[array] is a representation of a density plot.
 *
 *                   AspectRatio -> 1
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> Automatic
 *                   Background -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   DefaultColor -> Automatic
 *                   DefaultFont :> $DefaultFont
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FormatType :> $FormatType
 *                   Frame -> True
 *                   FrameLabel -> None
 *                   FrameStyle -> Automatic
 *                   FrameTicks -> Automatic
 *                   ImageSize -> Automatic
 *                   Mesh -> True
 *                   MeshRange -> Automatic
 *                   MeshStyle -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> Automatic
 *                   PlotRegion -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   TextStyle :> $TextStyle
 * Options:          Ticks -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DensityGraphics
 * Documentation:    web: http://reference.wolfram.com/language/ref/DensityGraphics.html
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
fun densityGraphics(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DensityGraphics", arguments.toMutableList(), options)
}

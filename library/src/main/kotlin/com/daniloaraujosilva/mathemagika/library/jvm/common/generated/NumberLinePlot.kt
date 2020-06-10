package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NumberLinePlot
 * 
 * Full name:        System`NumberLinePlot
 * 
 *                   NumberLinePlot[{v , v , …}] plots the values v  on a number line.
 *                                    1   2                        i
 *                   NumberLinePlot[pred, x] plots a number line illustrating the region pred.
 *                   NumberLinePlot[pred, {x, x   , x   }] plots the number to extend over the interval from x    to x   .
 *                                             min   max                                                      min     max
 *                   NumberLinePlot[{spec , spec , …}, …] plots several number lines.
 * Usage:                                1      2
 * 
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   AspectRatio -> Automatic
 *                   Axes -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FormatType :> TraditionalForm
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   IntervalMarkers -> Automatic
 *                   IntervalMarkersStyle -> Automatic
 *                   LabelStyle -> {}
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   Spacings -> Automatic
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NumberLinePlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumberLinePlot.html
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
fun numberLinePlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumberLinePlot", arguments.toMutableList(), options)
}

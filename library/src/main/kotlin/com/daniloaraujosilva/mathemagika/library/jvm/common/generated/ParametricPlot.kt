package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParametricPlot
 * 
 * Full name:        System`ParametricPlot
 * 
 *                   ParametricPlot[{f , f }, {u, u   , u   }] generates a parametric plot of a curve with x and y coordinates f  and f  as a function of u. 
 *                                    x   y        min   max                                                                    x      y
 *                   ParametricPlot[{{f , f }, {g , g }, …}, {u, u   , u   }] plots several parametric curves. 
 *                                     x   y     x   y            min   max
 *                   ParametricPlot[{f , f }, {u, u   , u   }, {v, v   , v   }] plots a parametric region. 
 *                                    x   y        min   max        min   max
 *                   ParametricPlot[{{f , f }, {g , g }, …}, {u, u   , u   }, {v, v   , v   }] plots several parametric regions. 
 *                                     x   y     x   y            min   max        min   max
 *                   ParametricPlot[{…, w[{f , f }], …}, …] plots the curve {f , f } with features defined by the symbolic wrapper w.
 *                                          x   y                             x   y
 * Usage:            ParametricPlot[…, {u, v} ∈ reg] takes parameters {u, v} to be in the geometric region reg.
 * 
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> True
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BoundaryStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   Evaluated -> Automatic
 *                   EvaluationMonitor -> None
 *                   Exclusions -> Automatic
 *                   ExclusionsStyle -> None
 *                   FormatType :> TraditionalForm
 *                   Frame -> Automatic
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
 *                   LabelingSize -> Automatic
 *                   LabelStyle -> {}
 *                   MaxRecursion -> Automatic
 *                   Mesh -> Automatic
 *                   MeshFunctions -> Automatic
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLabels -> None
 *                   PlotLegends -> None
 *                   PlotPoints -> Automatic
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotStyle -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RegionFunction -> (True & )
 *                   RotateLabel -> True
 *                   TargetUnits -> Automatic
 *                   TextureCoordinateFunction -> Automatic
 *                   TextureCoordinateScaling -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ParametricPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParametricPlot.html
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
fun parametricPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParametricPlot", arguments.toMutableList(), options)
}

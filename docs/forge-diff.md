# Forge vs Fabric 6.0.4 Differences

The upstream Forge repository ([Creators-of-Create/Create](https://github.com/Creators-of-Create/Create)) uses versioned branches such as `mc1.18/0.5.1` and offers no tags or branches for `6.0.4` or even Minecraft 1.19+.
Remote branch listings show only `mc1.14`–`mc1.18` series, with the newest branch being `mc1.18/0.5.1`.
Without a matching code release, comparisons rely on the Forge changelog instead.

| Feature/Behavior | Forge 6.0.4 | Fabric 6.0.4 | Status |
| --- | --- | --- | --- |
| Hose Pulley capacity | 1.5 buckets | 3 buckets | Altered |
| Placed fluid behaviour | Uses Forge fluid API | Differs due to missing Fabric Fluid API | Altered |
| Smart Observer Display Link | "Set to read fluids" option | Replaced with fluid unit selection and Shortened/Full Number toggle | Altered |
| 6.0.4 bug fixes (mechanical arm crash, map colours, etc.) | Listed in changelog | Changelog contains identical entries | Present |

